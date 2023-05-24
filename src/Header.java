class Headers {
    void Header(){
        System.out.println("\n======================================================");
        System.out.println("\t\t IMDB Fek \t\t  ");
        System.out.println("======================================================");
    }

}
class subHeader extends Headers{
    void Header(){
        System.out.println("\n======================================================");
        System.out.println(" Details \t\t  ");
        System.out.println("======================================================\n");
    }

}
class landPageHeader extends  Headers{
    void Header(String info){
        System.out.println("\n======================================================");
        System.out.println("\tIMDB Fek \t\t  "+info+"\t");
        System.out.println("======================================================");
    }
}
