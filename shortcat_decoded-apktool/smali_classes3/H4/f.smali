.class public final LH4/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LH4/i;


# instance fields
.field private final b:LH4/h;


# direct methods
.method public constructor <init>(LH4/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LH4/f;->b:LH4/h;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public c(LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p1, p0, LH4/f;->b:LH4/h;

    .line 2
    .line 3
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, LH4/f;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, LH4/f;->b:LH4/h;

    .line 10
    .line 11
    check-cast p1, LH4/f;

    .line 12
    .line 13
    iget-object p1, p1, LH4/f;->b:LH4/h;

    .line 14
    .line 15
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    return v0

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LH4/f;->b:LH4/h;

    .line 2
    .line 3
    invoke-virtual {v0}, LH4/h;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
