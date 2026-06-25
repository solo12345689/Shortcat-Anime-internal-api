.class LXg/a;
.super Ljava/lang/Object;


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private final g:LXg/f;

.field private h:I

.field private i:I

.field private j:I


# direct methods
.method public constructor <init>(IIIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LXg/a;->a:I

    .line 5
    .line 6
    iput p2, p0, LXg/a;->b:I

    .line 7
    .line 8
    iput p3, p0, LXg/a;->d:I

    .line 9
    .line 10
    iput p5, p0, LXg/a;->e:I

    .line 11
    .line 12
    iput p6, p0, LXg/a;->f:I

    .line 13
    .line 14
    div-int/lit8 p2, p2, 0x2

    .line 15
    .line 16
    iput p2, p0, LXg/a;->c:I

    .line 17
    .line 18
    div-int/lit8 p4, p4, 0x8

    .line 19
    .line 20
    iput p4, p0, LXg/a;->h:I

    .line 21
    .line 22
    add-int/lit8 p2, p1, 0x7

    .line 23
    .line 24
    ushr-int/lit8 p2, p2, 0x3

    .line 25
    .line 26
    iput p2, p0, LXg/a;->i:I

    .line 27
    .line 28
    mul-int/lit8 p2, p1, 0x2

    .line 29
    .line 30
    add-int/lit8 p2, p2, 0x7

    .line 31
    .line 32
    ushr-int/lit8 p2, p2, 0x3

    .line 33
    .line 34
    iput p2, p0, LXg/a;->j:I

    .line 35
    .line 36
    new-instance p2, LXg/f;

    .line 37
    .line 38
    invoke-direct {p2, p1}, LXg/f;-><init>(I)V

    .line 39
    .line 40
    .line 41
    iput-object p2, p0, LXg/a;->g:LXg/f;

    .line 42
    .line 43
    return-void
.end method
