.class public LZh/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Ljava/lang/CharSequence;

.field private final b:LYh/x;


# direct methods
.method private constructor <init>(Ljava/lang/CharSequence;LYh/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, LZh/f;->a:Ljava/lang/CharSequence;

    .line 7
    .line 8
    iput-object p2, p0, LZh/f;->b:LYh/x;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 12
    .line 13
    const-string p2, "content must not be null"

    .line 14
    .line 15
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1
.end method

.method public static c(Ljava/lang/CharSequence;LYh/x;)LZh/f;
    .locals 1

    .line 1
    new-instance v0, LZh/f;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LZh/f;-><init>(Ljava/lang/CharSequence;LYh/x;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, LZh/f;->a:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()LYh/x;
    .locals 1

    .line 1
    iget-object v0, p0, LZh/f;->b:LYh/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public d(II)LZh/f;
    .locals 2

    .line 1
    iget-object v0, p0, LZh/f;->a:Ljava/lang/CharSequence;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LZh/f;->b:LYh/x;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, LYh/x;->a()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, p1

    .line 16
    sub-int/2addr p2, p1

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, LZh/f;->b:LYh/x;

    .line 20
    .line 21
    invoke-virtual {p1}, LYh/x;->c()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {p1, v1, p2}, LYh/x;->d(III)LYh/x;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    :goto_0
    invoke-static {v0, p1}, LZh/f;->c(Ljava/lang/CharSequence;LYh/x;)LZh/f;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method
