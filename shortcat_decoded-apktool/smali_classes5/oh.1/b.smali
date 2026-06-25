.class public Loh/b;
.super LKg/a;


# instance fields
.field private final b:[B

.field private final c:Loh/a;


# direct methods
.method public constructor <init>(Loh/a;[B)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, LKg/a;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {p2}, LOh/a;->f([B)[B

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    iput-object p2, p0, Loh/b;->b:[B

    .line 10
    .line 11
    iput-object p1, p0, Loh/b;->c:Loh/a;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public b()Loh/a;
    .locals 1

    .line 1
    iget-object v0, p0, Loh/b;->c:Loh/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEncoded()[B
    .locals 1

    .line 1
    iget-object v0, p0, Loh/b;->b:[B

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
