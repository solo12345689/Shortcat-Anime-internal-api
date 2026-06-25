.class Ldh/f;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ldh/e;

.field private final b:[B

.field private final c:I

.field private final d:[B


# direct methods
.method constructor <init>(Ldh/e;[BI[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldh/f;->a:Ldh/e;

    .line 5
    .line 6
    iput-object p2, p0, Ldh/f;->b:[B

    .line 7
    .line 8
    iput p3, p0, Ldh/f;->c:I

    .line 9
    .line 10
    iput-object p4, p0, Ldh/f;->d:[B

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method a()Ldh/q;
    .locals 4

    .line 1
    new-instance v0, Ldh/q;

    .line 2
    .line 3
    iget-object v1, p0, Ldh/f;->b:[B

    .line 4
    .line 5
    iget-object v2, p0, Ldh/f;->d:[B

    .line 6
    .line 7
    iget-object v3, p0, Ldh/f;->a:Ldh/e;

    .line 8
    .line 9
    invoke-static {v3}, Ldh/b;->c(Ldh/e;)LFg/j;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-direct {v0, v1, v2, v3}, Ldh/q;-><init>([B[BLFg/j;)V

    .line 14
    .line 15
    .line 16
    iget v1, p0, Ldh/f;->c:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ldh/q;->e(I)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public b()[B
    .locals 1

    .line 1
    iget-object v0, p0, Ldh/f;->b:[B

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Ldh/e;
    .locals 1

    .line 1
    iget-object v0, p0, Ldh/f;->a:Ldh/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Ldh/f;->c:I

    .line 2
    .line 3
    return v0
.end method

.method e(Ldh/n;[[B)Ldh/i;
    .locals 7

    .line 1
    iget-object v0, p0, Ldh/f;->a:Ldh/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldh/e;->d()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-array v5, v0, [B

    .line 8
    .line 9
    invoke-virtual {p0}, Ldh/f;->a()Ldh/q;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, -0x3

    .line 14
    invoke-virtual {v0, v1}, Ldh/q;->d(I)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, v5, v1}, Ldh/q;->a([BZ)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Ldh/f;->a:Ldh/e;

    .line 22
    .line 23
    invoke-static {v0}, Ldh/b;->c(Ldh/e;)LFg/j;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {p0}, Ldh/f;->b()[B

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0, v4}, Ldh/p;->a([BLFg/j;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ldh/f;->d()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-static {v0, v4}, Ldh/p;->c(ILFg/j;)V

    .line 39
    .line 40
    .line 41
    const/16 v0, -0x7e7f

    .line 42
    .line 43
    invoke-static {v0, v4}, Ldh/p;->b(SLFg/j;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v5, v4}, Ldh/p;->a([BLFg/j;)V

    .line 47
    .line 48
    .line 49
    new-instance v1, Ldh/i;

    .line 50
    .line 51
    move-object v2, p0

    .line 52
    move-object v3, p1

    .line 53
    move-object v6, p2

    .line 54
    invoke-direct/range {v1 .. v6}, Ldh/i;-><init>(Ldh/f;Ldh/n;LFg/j;[B[[B)V

    .line 55
    .line 56
    .line 57
    return-object v1
.end method
