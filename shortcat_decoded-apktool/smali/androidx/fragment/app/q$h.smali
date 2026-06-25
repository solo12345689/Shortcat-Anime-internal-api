.class Landroidx/fragment/app/q$h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lq/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/q;->registerForActivityResult(Lh/a;Lg/b;)Lg/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/fragment/app/q;


# direct methods
.method constructor <init>(Landroidx/fragment/app/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/q$h;->a:Landroidx/fragment/app/q;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)Lg/f;
    .locals 2

    .line 1
    iget-object p1, p0, Landroidx/fragment/app/q$h;->a:Landroidx/fragment/app/q;

    .line 2
    .line 3
    iget-object v0, p1, Landroidx/fragment/app/q;->mHost:Landroidx/fragment/app/A;

    .line 4
    .line 5
    instance-of v1, v0, Lg/g;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lg/g;

    .line 10
    .line 11
    invoke-interface {v0}, Lg/g;->getActivityResultRegistry()Lg/f;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroidx/activity/j;->getActivityResultRegistry()Lg/f;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/fragment/app/q$h;->a(Ljava/lang/Void;)Lg/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
