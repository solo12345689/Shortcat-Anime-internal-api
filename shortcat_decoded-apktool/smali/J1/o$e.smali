.class LJ1/o$e;
.super LJ1/o$d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ1/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# instance fields
.field private final b:Z


# direct methods
.method constructor <init>(LJ1/o$c;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LJ1/o$d;-><init>(LJ1/o$c;)V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, LJ1/o$e;->b:Z

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LJ1/o$e;->b:Z

    .line 2
    .line 3
    return v0
.end method
