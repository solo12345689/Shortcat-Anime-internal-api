.class public Lw2/v;
.super Lw2/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field public final b:Lw2/o;

.field public final c:I


# direct methods
.method public constructor <init>(Ljava/io/IOException;Lw2/o;II)V
    .locals 0

    .line 7
    invoke-static {p3, p4}, Lw2/v;->b(II)I

    move-result p3

    invoke-direct {p0, p1, p3}, Lw2/l;-><init>(Ljava/lang/Throwable;I)V

    .line 8
    iput-object p2, p0, Lw2/v;->b:Lw2/o;

    .line 9
    iput p4, p0, Lw2/v;->c:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/io/IOException;Lw2/o;II)V
    .locals 0

    .line 10
    invoke-static {p4, p5}, Lw2/v;->b(II)I

    move-result p4

    invoke-direct {p0, p1, p2, p4}, Lw2/l;-><init>(Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 11
    iput-object p3, p0, Lw2/v;->b:Lw2/o;

    .line 12
    iput p5, p0, Lw2/v;->c:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lw2/o;II)V
    .locals 0

    .line 4
    invoke-static {p3, p4}, Lw2/v;->b(II)I

    move-result p3

    invoke-direct {p0, p1, p3}, Lw2/l;-><init>(Ljava/lang/String;I)V

    .line 5
    iput-object p2, p0, Lw2/v;->b:Lw2/o;

    .line 6
    iput p4, p0, Lw2/v;->c:I

    return-void
.end method

.method public constructor <init>(Lw2/o;II)V
    .locals 0

    .line 1
    invoke-static {p2, p3}, Lw2/v;->b(II)I

    move-result p2

    invoke-direct {p0, p2}, Lw2/l;-><init>(I)V

    .line 2
    iput-object p1, p0, Lw2/v;->b:Lw2/o;

    .line 3
    iput p3, p0, Lw2/v;->c:I

    return-void
.end method

.method private static b(II)I
    .locals 1

    .line 1
    const/16 v0, 0x7d0

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    const/16 p0, 0x7d1

    .line 9
    .line 10
    :cond_0
    return p0
.end method

.method public static c(Ljava/io/IOException;Lw2/o;I)Lw2/v;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, p0, Ljava/net/SocketTimeoutException;

    .line 6
    .line 7
    const/16 v2, 0x7d7

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/16 v0, 0x7d2

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    instance-of v1, p0, Ljava/io/InterruptedIOException;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    const/16 v0, 0x3ec

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-static {v0}, LO9/c;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "cleartext.*not permitted.*"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    move v0, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    const/16 v0, 0x7d1

    .line 38
    .line 39
    :goto_0
    if-ne v0, v2, :cond_3

    .line 40
    .line 41
    new-instance p2, Lw2/u;

    .line 42
    .line 43
    invoke-direct {p2, p0, p1}, Lw2/u;-><init>(Ljava/io/IOException;Lw2/o;)V

    .line 44
    .line 45
    .line 46
    return-object p2

    .line 47
    :cond_3
    new-instance v1, Lw2/v;

    .line 48
    .line 49
    invoke-direct {v1, p0, p1, v0, p2}, Lw2/v;-><init>(Ljava/io/IOException;Lw2/o;II)V

    .line 50
    .line 51
    .line 52
    return-object v1
.end method
