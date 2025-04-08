package Chess;
   public class Bauer extends ChessPiece {

        /**
         * Erstellt einen Bauern mit den gegebenen Koordinaten und Besitzer.
         *
         * @param besitzer    Der Besitzer der Figur (-1 für Schwarz, 1 für Weiß).
         * @param xKoordinate Die Startposition der Figur auf der x-Achse.
         * @param yKoordinate Die Startposition der Figur auf der y-Achse.
         */
        public Bauer(int besitzer, int xKoordinate, int yKoordinate) {
            super(1, besitzer, "B", xKoordinate, yKoordinate);
        }

        /**
         * Überprüft, ob der Bauer auf das angegebene Feld ziehen kann.
         * - Ein Feld nach vorne (abhängig von der Spielfarbe).
         *
         * @param zielX Die Ziel-x-Koordinate auf dem Schachbrett.
         * @param zielY Die Ziel-y-Koordinate auf dem Schachbrett.
         * @return {@code true}, sonst {@code false}.
         */

        @Override
        public boolean canMove(int zielX, int zielY) {
            int richtung = (this.getBesitzer() == 1) ? 1 : -1;
            int startReihe = (this.getBesitzer() == 1) ? 1 : 6; // Startreihe: für Weiß = 2, Schwarz = 7
            int aktuelleX = this.getXKoordinate();
            int aktuelleY = this.getYKoordinate();


            if (zielX == aktuelleX && zielY == aktuelleY + richtung) return true;

            if (zielX == aktuelleX && zielY == aktuelleY + (richtung + richtung) && aktuelleY == startReihe) return true;

            if (Math.abs(zielX - aktuelleX) == 1 && zielY == aktuelleY + richtung) return true;

            return false;}}

