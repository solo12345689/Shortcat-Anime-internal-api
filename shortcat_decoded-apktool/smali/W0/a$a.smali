.class public final LW0/a$a;
.super Landroid/text/SegmentFinder;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW0/a;->a(LW0/f;)Landroid/text/SegmentFinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LW0/f;


# direct methods
.method constructor <init>(LW0/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, LW0/a$a;->a:LW0/f;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/text/SegmentFinder;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public nextEndBoundary(I)I
    .locals 1

    .line 1
    iget-object v0, p0, LW0/a$a;->a:LW0/f;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW0/f;->c(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public nextStartBoundary(I)I
    .locals 1

    .line 1
    iget-object v0, p0, LW0/a$a;->a:LW0/f;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW0/f;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public previousEndBoundary(I)I
    .locals 1

    .line 1
    iget-object v0, p0, LW0/a$a;->a:LW0/f;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW0/f;->d(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public previousStartBoundary(I)I
    .locals 1

    .line 1
    iget-object v0, p0, LW0/a$a;->a:LW0/f;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW0/f;->b(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
