.class public LY4/g$b;
.super LY4/g$a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY4/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, LY4/g$b$a;

    .line 2
    .line 3
    invoke-direct {v0}, LY4/g$b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, LY4/g$a;-><init>(LY4/g$d;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
