.class public final synthetic Landroidx/activity/o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/activity/j;

.field public final synthetic b:Landroidx/activity/H;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/j;Landroidx/activity/H;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/activity/o;->a:Landroidx/activity/j;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/activity/o;->b:Landroidx/activity/H;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/activity/o;->a:Landroidx/activity/j;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/activity/o;->b:Landroidx/activity/H;

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/activity/j$j;->a(Landroidx/activity/j;Landroidx/activity/H;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
