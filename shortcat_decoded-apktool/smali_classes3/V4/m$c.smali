.class LV4/m$c;
.super LV4/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV4/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LV4/c;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method protected bridge synthetic a()LV4/l;
    .locals 1

    .line 1
    invoke-virtual {p0}, LV4/m$c;->d()LV4/m$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected d()LV4/m$b;
    .locals 1

    .line 1
    new-instance v0, LV4/m$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LV4/m$b;-><init>(LV4/m$c;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public e(ILandroid/graphics/Bitmap$Config;)LV4/m$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, LV4/c;->b()LV4/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LV4/m$b;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, LV4/m$b;->b(ILandroid/graphics/Bitmap$Config;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
