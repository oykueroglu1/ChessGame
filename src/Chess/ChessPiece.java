package Chess;

public abstract class ChessPiece {
        private final int wert;
        private final int besitzer;
        private final String symbol;
        private int xKoordinate;
        private int yKoordinate;

        /**
         * Konstruktor für eine Schachfigur mit bestimmten Eigenschaften.
         *
         * @param wert        Der Wert der Schachfigur.
         * @param besitzer    Der Besitzer der Schachfigur (-1 für Schwarz, 1 für Weiß).
         * @param symbol      Das Symbol, das die Schachfigur repräsentiert.
         * @param xKoordinate Die anfängliche x-Koordinate der Schachfigur.
         * @param yKoordinate Die anfängliche y-Koordinate der Schachfigur.
         */

        public ChessPiece(int wert, int besitzer, String symbol, int xKoordinate, int yKoordinate) {
            this.wert = wert;
            this.besitzer = besitzer;
            this.symbol = symbol;
            this.xKoordinate = xKoordinate;
            this.yKoordinate = yKoordinate;}

        /**
         * Gibt den Wert der Schachfigur zurück.
         *
         * @return Der Wert der Schachfigur.
         */
        public int getWert() {
            return wert;}
        /**
         * Gibt den Besitzer der Schachfigur zurück.
         *
         * @return Der Besitzer der Schachfigur (-1 für Schwarz, 1 für Weiß).
         */
        public int getBesitzer() {
            return besitzer;}

        public String getSymbol() {
            return symbol;}

        public int getXKoordinate() {
            return xKoordinate;}

        public int getYKoordinate() {
            return yKoordinate;}


        /**
         * Setzt die neue Position der Schachfigur auf dem Schachbrett.
         *
         * @param x Die neue x-Koordinate der Figur.
         * @param y Die neue y-Koordinate der Figur.
         */
        public void setPosition(int x, int y) {
            this.xKoordinate = x;
            this.yKoordinate = y;
        }

//  d)  boolean canMove(int x, int y)

        /**
         * Prüft, ob die Schachfigur sich auf die angegebene Position bewegen kann.
         *
         * @param x Die Ziel-x-Koordinate.
         * @param y Die Ziel-y-Koordinate.
         * @return True, wenn die Figur sich auf die angegebene Position bewegen kann, sonst false.
         */
        public abstract boolean canMove(int x, int y); }

