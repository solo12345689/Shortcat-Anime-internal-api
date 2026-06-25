.class final LXa/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LXa/h;


# instance fields
.field private a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    iput v0, p0, LXa/d;->a:I

    .line 6
    .line 7
    return-void
.end method

.method private final b(I)Z
    .locals 1

    .line 1
    rem-int/lit8 p1, p1, 0xa

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    return p1
.end method

.method private final c()V
    .locals 1

    .line 1
    iget v0, p0, LXa/d;->a:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iput v0, p0, LXa/d;->a:I

    .line 6
    .line 7
    invoke-direct {p0, v0}, LXa/d;->b(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget v0, p0, LXa/d;->a:I

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    iput v0, p0, LXa/d;->a:I

    .line 18
    .line 19
    :cond_0
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, LXa/d;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, LXa/d;->c()V

    .line 4
    .line 5
    .line 6
    return v0
.end method
