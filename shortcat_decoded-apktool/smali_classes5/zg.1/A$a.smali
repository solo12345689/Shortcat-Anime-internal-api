.class final Lzg/A$a;
.super Lzg/L;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzg/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lzg/L;-><init>(Ljava/lang/Class;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method d(Lzg/n0;)Lzg/y;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lzg/u;->B()[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {p1, v0}, Lzg/A;->A([BZ)Lzg/A;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method
