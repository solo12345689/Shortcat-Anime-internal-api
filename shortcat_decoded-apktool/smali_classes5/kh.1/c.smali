.class public Lkh/c;
.super Lkh/a;


# instance fields
.field private final c:[B


# direct methods
.method public constructor <init>(Lkh/b;[B)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0, p1}, Lkh/a;-><init>(ZLkh/b;)V

    .line 3
    .line 4
    .line 5
    invoke-static {p2}, LOh/a;->f([B)[B

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lkh/c;->c:[B

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public getEncoded()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lkh/c;->c:[B

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
