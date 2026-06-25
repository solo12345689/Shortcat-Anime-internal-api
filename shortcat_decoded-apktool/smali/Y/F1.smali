.class final LY/F1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lk0/k;
.implements Ljava/lang/Iterable;
.implements Lje/a;


# instance fields
.field private final a:LY/E1;

.field private final b:I

.field private final c:I


# direct methods
.method public constructor <init>(LY/E1;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY/F1;->a:LY/E1;

    .line 5
    .line 6
    iput p2, p0, LY/F1;->b:I

    .line 7
    .line 8
    iput p3, p0, LY/F1;->c:I

    .line 9
    .line 10
    return-void
.end method

.method private final b()V
    .locals 2

    .line 1
    iget-object v0, p0, LY/F1;->a:LY/E1;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/E1;->z()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, LY/F1;->c:I

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    invoke-static {}, LY/G1;->u()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 6

    .line 1
    invoke-direct {p0}, LY/F1;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LY/F1;->a:LY/E1;

    .line 5
    .line 6
    iget v1, p0, LY/F1;->b:I

    .line 7
    .line 8
    invoke-virtual {v0, v1}, LY/E1;->L(I)LY/h0;

    .line 9
    .line 10
    .line 11
    new-instance v0, LY/f0;

    .line 12
    .line 13
    iget-object v1, p0, LY/F1;->a:LY/E1;

    .line 14
    .line 15
    iget v2, p0, LY/F1;->b:I

    .line 16
    .line 17
    add-int/lit8 v3, v2, 0x1

    .line 18
    .line 19
    invoke-virtual {v1}, LY/E1;->t()[I

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    iget v5, p0, LY/F1;->b:I

    .line 24
    .line 25
    invoke-static {v4, v5}, LY/G1;->c([II)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    add-int/2addr v2, v4

    .line 30
    invoke-direct {v0, v1, v3, v2}, LY/f0;-><init>(LY/E1;II)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method
