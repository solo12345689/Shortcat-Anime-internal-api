.class final LK/m0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements La1/J;


# instance fields
.field private final b:La1/J;

.field private final c:I

.field private final d:I


# direct methods
.method public constructor <init>(La1/J;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK/m0;->b:La1/J;

    .line 5
    .line 6
    iput p2, p0, LK/m0;->c:I

    .line 7
    .line 8
    iput p3, p0, LK/m0;->d:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 2

    .line 1
    iget-object v0, p0, LK/m0;->b:La1/J;

    .line 2
    .line 3
    invoke-interface {v0, p1}, La1/J;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ltz p1, :cond_0

    .line 8
    .line 9
    iget v1, p0, LK/m0;->d:I

    .line 10
    .line 11
    if-gt p1, v1, :cond_0

    .line 12
    .line 13
    iget v1, p0, LK/m0;->c:I

    .line 14
    .line 15
    invoke-static {v0, v1, p1}, LK/n0;->b(III)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return v0
.end method

.method public b(I)I
    .locals 2

    .line 1
    iget-object v0, p0, LK/m0;->b:La1/J;

    .line 2
    .line 3
    invoke-interface {v0, p1}, La1/J;->b(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ltz p1, :cond_0

    .line 8
    .line 9
    iget v1, p0, LK/m0;->c:I

    .line 10
    .line 11
    if-gt p1, v1, :cond_0

    .line 12
    .line 13
    iget v1, p0, LK/m0;->d:I

    .line 14
    .line 15
    invoke-static {v0, v1, p1}, LK/n0;->a(III)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return v0
.end method
