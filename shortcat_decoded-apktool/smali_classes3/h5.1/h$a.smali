.class Lh5/h$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh5/h;->a(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lh5/h;


# direct methods
.method constructor <init>(Lh5/h;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh5/h$a;->b:Lh5/h;

    .line 2
    .line 3
    iput-object p2, p0, Lh5/h$a;->a:Landroid/view/View;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onDraw()V
    .locals 1

    .line 1
    new-instance v0, Lh5/h$a$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p0}, Lh5/h$a$a;-><init>(Lh5/h$a;Landroid/view/ViewTreeObserver$OnDrawListener;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lo5/l;->w(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
