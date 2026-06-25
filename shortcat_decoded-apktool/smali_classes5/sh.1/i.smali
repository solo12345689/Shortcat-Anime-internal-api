.class final Lsh/i;
.super Lsh/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsh/i$b;
    }
.end annotation


# instance fields
.field private final e:I

.field private final f:I

.field private final g:I


# direct methods
.method private constructor <init>(Lsh/i$b;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lsh/o;-><init>(Lsh/o$a;)V

    invoke-static {p1}, Lsh/i$b;->i(Lsh/i$b;)I

    move-result v0

    iput v0, p0, Lsh/i;->e:I

    invoke-static {p1}, Lsh/i$b;->j(Lsh/i$b;)I

    move-result v0

    iput v0, p0, Lsh/i;->f:I

    invoke-static {p1}, Lsh/i$b;->k(Lsh/i$b;)I

    move-result p1

    iput p1, p0, Lsh/i;->g:I

    return-void
.end method

.method synthetic constructor <init>(Lsh/i$b;Lsh/i$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lsh/i;-><init>(Lsh/i$b;)V

    return-void
.end method


# virtual methods
.method protected d()[B
    .locals 3

    .line 1
    invoke-super {p0}, Lsh/o;->d()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lsh/i;->e:I

    .line 6
    .line 7
    const/16 v2, 0x10

    .line 8
    .line 9
    invoke-static {v1, v0, v2}, LOh/g;->c(I[BI)V

    .line 10
    .line 11
    .line 12
    iget v1, p0, Lsh/i;->f:I

    .line 13
    .line 14
    const/16 v2, 0x14

    .line 15
    .line 16
    invoke-static {v1, v0, v2}, LOh/g;->c(I[BI)V

    .line 17
    .line 18
    .line 19
    iget v1, p0, Lsh/i;->g:I

    .line 20
    .line 21
    const/16 v2, 0x18

    .line 22
    .line 23
    invoke-static {v1, v0, v2}, LOh/g;->c(I[BI)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method protected e()I
    .locals 1

    .line 1
    iget v0, p0, Lsh/i;->e:I

    .line 2
    .line 3
    return v0
.end method

.method protected f()I
    .locals 1

    .line 1
    iget v0, p0, Lsh/i;->f:I

    .line 2
    .line 3
    return v0
.end method

.method protected g()I
    .locals 1

    .line 1
    iget v0, p0, Lsh/i;->g:I

    .line 2
    .line 3
    return v0
.end method
