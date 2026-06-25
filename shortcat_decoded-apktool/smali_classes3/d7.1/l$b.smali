.class public final Ld7/l$b;
.super Landroid/graphics/drawable/ColorDrawable;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld7/l;->f()Landroid/widget/LinearLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ld7/l;


# direct methods
.method constructor <init>(Ld7/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld7/l$b;->a:Ld7/l;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public getIntrinsicWidth()I
    .locals 2

    .line 1
    iget-object v0, p0, Ld7/l$b;->a:Ld7/l;

    .line 2
    .line 3
    const/high16 v1, 0x41200000    # 10.0f

    .line 4
    .line 5
    invoke-static {v0, v1}, Ld7/l;->c(Ld7/l;F)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    float-to-int v0, v0

    .line 10
    return v0
.end method
