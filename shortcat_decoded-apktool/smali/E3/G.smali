.class public final synthetic LE3/G;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lt2/n;


# instance fields
.field public final synthetic a:LE3/S1;

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(LE3/S1;ZZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/G;->a:LE3/S1;

    .line 5
    .line 6
    iput-boolean p2, p0, LE3/G;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, LE3/G;->c:Z

    .line 9
    .line 10
    iput p4, p0, LE3/G;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, LE3/G;->a:LE3/S1;

    .line 2
    .line 3
    iget-boolean v1, p0, LE3/G;->b:Z

    .line 4
    .line 5
    iget-boolean v2, p0, LE3/G;->c:Z

    .line 6
    .line 7
    iget v3, p0, LE3/G;->d:I

    .line 8
    .line 9
    check-cast p1, LE3/A$c;

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, p1}, LE3/S1;->I1(LE3/S1;ZZILE3/A$c;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
