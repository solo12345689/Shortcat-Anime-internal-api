.class public final synthetic LE3/a6;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE3/I6$e;


# instance fields
.field public final synthetic a:LE3/Y2;


# direct methods
.method public synthetic constructor <init>(LE3/Y2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/a6;->a:LE3/Y2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(LE3/I3;LE3/h3$g;I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/a6;->a:LE3/Y2;

    .line 2
    .line 3
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-static {v0, p1, p2, p3}, LE3/I6;->P3(LE3/Y2;LE3/Z2;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
