package ferros.view;

import ferros.controller.PostController;
import ferros.model.Post;

import java.util.Scanner;

public class PostView {
    private Scanner scanner = new Scanner(System.in);
    private PostController controller = new PostController();

    private final String CRUDMassage = "Chose action: \n" +
            "1.Create \n" +
            "2.Show all \n" +
            "3.Show by ID \n" +
            "4.Update \n" +
            "5.Delete \n" +
            "6.Exit to previous menu";
    private final String line = "****************************************";

    public void createPost() {
        scanner.nextLine();
        System.out.println("Enter your Post: ");
        String content = scanner.nextLine();

        Post createdPost = controller.savePost(content);
        System.out.println("Saved post: " + createdPost);
    }

    public void findPostById() {
        System.out.println("Enter ID of desired Post: ");
        int lookedId = scanner.nextInt();
        scanner.skip("\n");

        Post foundedPost = controller.findPostById(lookedId);
        System.out.println("Desired Post: " + foundedPost);
    }

    public void showAllPosts() {
        System.out.println("All posts: ");
        controller.printPostList(controller.getAllPosts());
    }

    public void updatePost() {
        System.out.println("Enter Post id: ");
        int updatedPostID = scanner.nextInt();
        scanner.skip("\n");
        System.out.println("Desired Post: " + controller.findPostById(updatedPostID));


        System.out.println("Change name of Post: ");
        String updatedPostName = scanner.nextLine();

        Post updatedPost = new Post(updatedPostID, updatedPostName);
        controller.update(updatedPost);
    }

    public void deletePostByID() {
        System.out.println("Enter Post Id: ");
        int deletedPostID = scanner.nextInt();
        scanner.skip("\n");
        Post post = controller.findPostById(deletedPostID);
        controller.deletePostById(deletedPostID);
        System.out.println(post + "  successfully deleted");
    }

    public void showMenuMassage() {
        System.out.println(line);
        System.out.println(CRUDMassage);
        System.out.println(line);
    }

    public void menuChoice() {
        int chose;
        do {
            showMenuMassage();
            chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    createPost();

                    break;
                case 2:
                    showAllPosts();
                    break;
                case 3:
                    findPostById();
                    break;
                case 4:
                    updatePost();
                    break;
                case 5:
                    deletePostByID();
                    break;

            }
        } while (chose != 6);


    }
}
