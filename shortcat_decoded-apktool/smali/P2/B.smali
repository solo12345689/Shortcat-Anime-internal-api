.class public final LP2/B;
.super LP2/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final i:I

.field private final j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq2/a0;II)V
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    .line 1
    invoke-direct/range {v0 .. v5}, LP2/B;-><init>(Lq2/a0;IIILjava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lq2/a0;IIILjava/lang/Object;)V
    .locals 0

    .line 2
    filled-new-array {p2}, [I

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, LP2/c;-><init>(Lq2/a0;[II)V

    .line 3
    iput p4, p0, LP2/B;->i:I

    .line 4
    iput-object p5, p0, LP2/B;->j:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public i()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LP2/B;->j:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public k(JJJLjava/util/List;[LN2/n;)V
    .locals 0

    .line 1
    return-void
.end method

.method public r()I
    .locals 1

    .line 1
    iget v0, p0, LP2/B;->i:I

    .line 2
    .line 3
    return v0
.end method
