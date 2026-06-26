import "./globals.css";

export const metadata = {
  title: "Shortcat Web Stream & API Console",
  description: "Reverse engineered micro-drama streaming and identity interface for Shortcat Anime.",
};

export default function RootLayout({ children }) {
  return (
    <html lang="en" suppressHydrationWarning>
      <body>{children}</body>
    </html>
  );
}
