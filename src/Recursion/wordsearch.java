//class Solution {
//    public static boolean words(char[][] mat, String word,int row,int column,int wordlength){
//        if(wordlength==word.length()){
//            return true;
//        }
//        //false cases
//        if(row<0 || column<0 || row>mat.length || column>mat[0].length || mat[row][column]==' ' || mat[row][column]!=word.charAt(word.length())){return false;}
//        char c=mat[row][column];
//        mat[row][column]=' ';
//        if(words(mat,word,row+1,column,wordlength+1)||words(mat,word,row-1,column,wordlength+1)||words(mat,word,row,column+1,wordlength+1)||words(mat,word,row,column-1,wordlength+1)){return true;}
//        mat[row][column]=c;
//        return false;
//    }
//    public boolean isWordExist(char[][] mat, String word) {
//        for(int i=0;i<mat.length;i++){
//            for(int j=0;j<mat[0].length;j++){
//               boolean tr=words(mat,word,i,j,0);
//               if(tr==true){
//                   return tr;
//               }
//            }
//        }
//        return false;
//    }
//}
