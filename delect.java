import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("How many playlist do you want?:");
            int playlist = scan.nextInt();
            scan.nextLine();

            String[] playlistnames = new String[playlist];
            String[][] songs = new String[playlist][];

            for (int i = 0; i < playlist; i++) {
                System.out.print("\nEnter the playlist name:");
                playlistnames[i] = scan.nextLine();
                System.out.print("Enter the number of the song do you want in " + playlistnames[i] + "?");
                int size = scan.nextInt();
                scan.nextLine();

                songs[i] = new String[size];
                for (int j = 0; j < size; j++) {
                    System.out.print("Enter song " + (j + 1) + ": ");
                    songs[i][j] = scan.nextLine();
                }
            }

            System.out.print("\n------ALL PLAYLIST------");
            for (int i = 0; i < playlist; i++) {
                System.out.println("\nPlaylist " + playlistnames[i]);
                for (int j = 0; j < songs[i].length; j++) {
                    System.out.println((j + 1) + "." + songs[i][j]);
                }
            }

            System.out.print("\nDo you wanna remove songs in the playlist?(yes/no):");
            String choice = scan.nextLine();
            if (choice.equalsIgnoreCase("yes")) {
                System.out.print("Enter the playlist's name:");
                String searchplaylist = scan.nextLine();
                System.out.print("Enter the song you want to remove:");
                String songremove = scan.nextLine();
                boolean remove = false;

                for (int i = 0; i < playlist; i++) {
                    if (playlistnames[i].equalsIgnoreCase(searchplaylist)) {
                        for (int j = 0; j < songs[i].length; j++) {
                            if (songs[i][j].equalsIgnoreCase(songremove)) {
                                songs[i][j] = "[REMOVED]";
                                remove = true;
                                System.out.print(songremove+" has been removed");
                            }
                        }
                    }
                }

                if (!remove) {
                    System.out.print("This song is not here");
                }
            }

            System.out.println("\nUPDATED SONGS");
            for (int i = 0; i < playlist; i++) {
                for (int j = 0; j < songs[i].length; j++) {
                    System.out.println("\nPlaylist: "+(j + 1) + ". " + songs[i][j]);
                }
            }

            System.out.print("\nEnter the song name to search:");
            String searchforsong = scan.nextLine();
            boolean found = false;
            for (int i = 0; i < playlist; i++) {
                for (int j = 0; j < songs[i].length; j++) {
                    if (songs[i][j].equalsIgnoreCase(searchforsong)) {
                        System.out.println("\nSong found!");
                        System.out.println(" Playlist: " + playlistnames[i]);
                        System.out.println(" Song Name: " + songs[i][j]);
                        System.out.println(" Song Position: " + (j + 1));
                        found = true;
                        break;
                    
                    }
                }
            }

            if (!found) {
                System.out.print("The song is not exist in playlist");
            }
        } catch (NegativeArraySizeException e) {
            System.out.println("You can't enter a negative number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This song is not here.");
        } catch (InputMismatchException e) {
            System.out.println("Please enter your playlist size.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            scan.close();
        }
    }
}
