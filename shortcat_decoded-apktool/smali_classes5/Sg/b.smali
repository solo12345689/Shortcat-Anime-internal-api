.class public LSg/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/spec/KeySpec;


# instance fields
.field private final a:[B

.field private final b:[B

.field private final c:LSg/a;

.field private final d:Z


# direct methods
.method public constructor <init>(LSg/a;[B)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p2

    const/16 v1, 0x40

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, LSg/b;->d:Z

    iput-object p1, p0, LSg/b;->c:LSg/a;

    invoke-static {p2}, LOh/a;->f([B)[B

    move-result-object p1

    iput-object p1, p0, LSg/b;->a:[B

    const/4 p1, 0x0

    iput-object p1, p0, LSg/b;->b:[B

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "incorrect length for seed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(LSg/a;[B[B)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LSg/b;->d:Z

    iput-object p1, p0, LSg/b;->c:LSg/a;

    invoke-static {p2}, LOh/a;->f([B)[B

    move-result-object p1

    iput-object p1, p0, LSg/b;->a:[B

    invoke-static {p3}, LOh/a;->f([B)[B

    move-result-object p1

    iput-object p1, p0, LSg/b;->b:[B

    return-void
.end method


# virtual methods
.method public a()LSg/a;
    .locals 1

    .line 1
    iget-object v0, p0, LSg/b;->c:LSg/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()[B
    .locals 2

    .line 1
    invoke-virtual {p0}, LSg/b;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LSg/b;->a:[B

    .line 8
    .line 9
    invoke-static {v0}, LOh/a;->f([B)[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v1, "KeySpec represents seed"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0
.end method

.method public c()[B
    .locals 2

    .line 1
    invoke-virtual {p0}, LSg/b;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LSg/b;->b:[B

    .line 8
    .line 9
    invoke-static {v0}, LOh/a;->f([B)[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v1, "KeySpec represents long form"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0
.end method

.method public d()[B
    .locals 2

    .line 1
    invoke-virtual {p0}, LSg/b;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LSg/b;->a:[B

    .line 8
    .line 9
    invoke-static {v0}, LOh/a;->f([B)[B

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v1, "KeySpec represents long form"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LSg/b;->d:Z

    .line 2
    .line 3
    return v0
.end method
