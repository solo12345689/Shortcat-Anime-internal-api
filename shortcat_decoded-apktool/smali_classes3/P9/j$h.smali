.class LP9/j$h;
.super Ljava/util/AbstractCollection;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP9/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "h"
.end annotation


# instance fields
.field final synthetic a:LP9/j;


# direct methods
.method constructor <init>(LP9/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP9/j$h;->a:LP9/j;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 1
    iget-object v0, p0, LP9/j$h;->a:LP9/j;

    .line 2
    .line 3
    invoke-virtual {v0}, LP9/j;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, LP9/j$h;->a:LP9/j;

    .line 2
    .line 3
    invoke-virtual {v0}, LP9/j;->c0()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, LP9/j$h;->a:LP9/j;

    .line 2
    .line 3
    invoke-virtual {v0}, LP9/j;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
