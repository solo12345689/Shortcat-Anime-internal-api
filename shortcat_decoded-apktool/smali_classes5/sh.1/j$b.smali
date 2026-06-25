.class public Lsh/j$b;
.super Lsh/o$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsh/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "b"
.end annotation


# instance fields
.field private e:I

.field private f:I

.field private g:I


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lsh/o$a;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput v0, p0, Lsh/j$b;->e:I

    .line 6
    .line 7
    iput v0, p0, Lsh/j$b;->f:I

    .line 8
    .line 9
    iput v0, p0, Lsh/j$b;->g:I

    .line 10
    .line 11
    return-void
.end method

.method static synthetic i(Lsh/j$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lsh/j$b;->e:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic j(Lsh/j$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lsh/j$b;->f:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic k(Lsh/j$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lsh/j$b;->g:I

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method protected bridge synthetic e()Lsh/o$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsh/j$b;->m()Lsh/j$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected l()Lsh/o;
    .locals 2

    .line 1
    new-instance v0, Lsh/j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lsh/j;-><init>(Lsh/j$b;Lsh/j$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method protected m()Lsh/j$b;
    .locals 0

    .line 1
    return-object p0
.end method

.method protected n(I)Lsh/j$b;
    .locals 0

    .line 1
    iput p1, p0, Lsh/j$b;->f:I

    .line 2
    .line 3
    return-object p0
.end method

.method protected o(I)Lsh/j$b;
    .locals 0

    .line 1
    iput p1, p0, Lsh/j$b;->g:I

    .line 2
    .line 3
    return-object p0
.end method

.method protected p(I)Lsh/j$b;
    .locals 0

    .line 1
    iput p1, p0, Lsh/j$b;->e:I

    .line 2
    .line 3
    return-object p0
.end method
