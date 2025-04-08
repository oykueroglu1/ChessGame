package Chess;
import java.util.ArrayList;
import java.util.List;


    public class ChessBoard {
        private ChessPiece[][] spielbrett;

        public ChessBoard() {
            spielbrett = new ChessPiece[8][8];
            initialisiereSpielbrett();}

        /**
         * Initialisiert das Schachbrett mit den Standard-Schachfiguren.
         */
        private void initialisiereSpielbrett() {
            for (int i = 0; i < 8; i++) {
                spielbrett[1][i] = new Bauer(1, 1, i);
                spielbrett[6][i] = new Bauer(-1, 6, i);
            }
            spielbrett[0][0] = new Turm(1, 0, 0);
            spielbrett[0][7] = new Turm(1, 0, 7);
            spielbrett[7][0] = new Turm(-1, 7, 0);
            spielbrett[7][7] = new Turm(-1, 7, 7);
            spielbrett[0][1] = new Springer(1, 0, 1);
            spielbrett[0][6] = new Springer(1, 0, 6);
            spielbrett[7][1] = new Springer(-1, 7, 1);
            spielbrett[7][6] = new Springer(-1, 7, 6);
            spielbrett[0][2] = new Laeufer(1, 0, 2);
            spielbrett[0][5] = new Laeufer(1, 0, 5);
            spielbrett[7][2] = new Laeufer(-1, 7, 2);
            spielbrett[7][5] = new Laeufer(-1, 7, 5);
            spielbrett[0][3] = new Dame(1, 0, 3);
            spielbrett[7][3] = new Dame(-1, 7, 3);
            spielbrett[0][4] = new Koenig(1, 0, 4);
            spielbrett[7][4] = new Koenig(-1, 7, 4);
        }
        /**
         * Gibt eine Liste aller aktuell aktiven Schachfiguren auf dem Spielfeld zurück.
         *
         * @return Eine Liste aller auf dem Brett befindlichen Schachfiguren.
         */
        public List<ChessPiece> piecesInPlay() {
            List<ChessPiece> aktive = new ArrayList<>();
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (spielbrett[i][j] != null) {
                        aktive.add(spielbrett[i][j]); }
                }
            } return aktive; }

        /**
         * Gibt das Schachbrett rekursiv als Text auf der Konsole aus.
         * Leere Felder werden als "." dargestellt.
         */
        public void aktuellerZustand() {
            aktuellerZustandHelper(0, 0);
        }

        /**
         * Hilfsmethode für die rekursive Ausgabe des Schachbretts mit switch-case.
         *
         * @param zeile  Die aktuelle Zeile im Schachbrett.
         * @param spalte Die aktuelle Spalte im Schachbrett.
         */
        private void aktuellerZustandHelper(int zeile, int spalte) {
            if (zeile >= 8) {
                return; }

            String symbol = (spielbrett[zeile][spalte] != null) ? spielbrett[zeile][spalte].getSymbol() : ".";

            switch (spalte) {
                case 7:
                    System.out.println(symbol + " ");
                    aktuellerZustandHelper(zeile + 1, 0);
                    break;
                default:
                    System.out.print(symbol + " ");
                    aktuellerZustandHelper(zeile, spalte + 1);
                    break;}}

        /**
         * Bewegt eine Figur auf dem Schachbrett, falls der Zug gültig ist.
         *
         * - Überprüft, ob die Figur sich auf das gewünschte Feld bewegen kann.
         *
         * @param piece Die zu bewegende Schachfigur.
         * @param neuXKoordinate  Die Ziel-x-Koordinate auf dem Schachbrett.
         * @param neuYKoordinate  Die Ziel-y-Koordinate auf dem Schachbrett.
         */

        public void movePiece(ChessPiece piece, int neuXKoordinate, int neuYKoordinate) {
            if (piece.canMove(neuXKoordinate, neuYKoordinate)) {

                spielbrett[piece.getXKoordinate()][piece.getYKoordinate()] = null;

                piece.setPosition(neuXKoordinate, neuYKoordinate);
                spielbrett[neuXKoordinate][neuYKoordinate] = piece;

                System.out.println("Figur bewegt: " + piece.getSymbol() + " nach (" + neuXKoordinate + "," + neuYKoordinate + ")");
            } else {
                System.out.println("Ungültiger Zug für " + piece.getSymbol());}}}

