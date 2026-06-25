.class public final synthetic LE3/J3;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LE3/I3$b;

.field public final synthetic b:LE3/h3$g;

.field public final synthetic c:Landroid/view/KeyEvent;


# direct methods
.method public synthetic constructor <init>(LE3/I3$b;LE3/h3$g;Landroid/view/KeyEvent;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/J3;->a:LE3/I3$b;

    .line 5
    .line 6
    iput-object p2, p0, LE3/J3;->b:LE3/h3$g;

    .line 7
    .line 8
    iput-object p3, p0, LE3/J3;->c:Landroid/view/KeyEvent;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LE3/J3;->a:LE3/I3$b;

    .line 2
    .line 3
    iget-object v1, p0, LE3/J3;->b:LE3/h3$g;

    .line 4
    .line 5
    iget-object v2, p0, LE3/J3;->c:Landroid/view/KeyEvent;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LE3/I3$b;->a(LE3/I3$b;LE3/h3$g;Landroid/view/KeyEvent;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
