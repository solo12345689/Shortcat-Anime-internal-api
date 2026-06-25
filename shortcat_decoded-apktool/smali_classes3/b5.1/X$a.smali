.class Lb5/X$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lb5/r$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb5/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final a:Lb5/V;

.field private final b:Lo5/d;


# direct methods
.method constructor <init>(Lb5/V;Lo5/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb5/X$a;->a:Lb5/V;

    .line 5
    .line 6
    iput-object p2, p0, Lb5/X$a;->b:Lo5/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/X$a;->a:Lb5/V;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb5/V;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(LV4/d;Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/X$a;->b:Lo5/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo5/d;->a()Ljava/io/IOException;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-interface {p1, p2}, LV4/d;->c(Landroid/graphics/Bitmap;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    throw v0

    .line 15
    :cond_1
    return-void
.end method
