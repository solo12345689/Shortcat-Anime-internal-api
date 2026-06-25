.class public Lch/f;
.super Lch/c;


# instance fields
.field private c:[B


# direct methods
.method public constructor <init>(Lch/d;[B)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0, p1}, Lch/c;-><init>(ZLch/d;)V

    .line 3
    .line 4
    .line 5
    invoke-static {p2}, LOh/a;->f([B)[B

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lch/f;->c:[B

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public c()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lch/f;->c:[B

    .line 2
    .line 3
    invoke-static {v0}, LOh/a;->f([B)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getEncoded()[B
    .locals 1

    .line 1
    invoke-virtual {p0}, Lch/f;->c()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
