.class public final synthetic Ld7/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/core/view/I;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:Landroid/app/Dialog;


# direct methods
.method public synthetic constructor <init>(FLandroid/app/Dialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ld7/k;->a:F

    .line 5
    .line 6
    iput-object p2, p0, Ld7/k;->b:Landroid/app/Dialog;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 2

    .line 1
    iget v0, p0, Ld7/k;->a:F

    .line 2
    .line 3
    iget-object v1, p0, Ld7/k;->b:Landroid/app/Dialog;

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2}, Ld7/l;->a(FLandroid/app/Dialog;Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
