package Chess;
   public class Main {
            public static void main(String[] args) {
                ChessBoard spielbrett = new ChessBoard();

                ChessPiece weißerTurm = spielbrett.piecesInPlay().get(7);
                spielbrett.movePiece(weißerTurm, 5, 7);

                ChessPiece weißerBauer1 = spielbrett.piecesInPlay().get(8);
                spielbrett.movePiece(weißerBauer1, 2, 4);

                ChessPiece weißerBauer2 = spielbrett.piecesInPlay().get(9);
                spielbrett.movePiece(weißerBauer2, 2, 3);

                ChessPiece weißerSpringer = spielbrett.piecesInPlay().get(10);
                spielbrett.movePiece(weißerSpringer, 6, 6);

                ChessPiece schwarzerBauer1 = spielbrett.piecesInPlay().get(16);
                spielbrett.movePiece(schwarzerBauer1, 5, 6);

                ChessPiece schwarzerBauer2 = spielbrett.piecesInPlay().get(17);
                spielbrett.movePiece(schwarzerBauer2, 5, 5);

                ChessPiece schwarzerSpringer = spielbrett.piecesInPlay().get(18);
                spielbrett.movePiece(schwarzerSpringer, 3, 3);

                spielbrett.aktuellerZustand(); }}

