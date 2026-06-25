.class LV5/a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LV5/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV5/a;->a(I)LV5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:LV5/a;


# direct methods
.method constructor <init>(LV5/a;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LV5/a$a;->b:LV5/a;

    .line 2
    .line 3
    iput p2, p0, LV5/a$a;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public b()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-object v0, p0, LV5/a$a;->b:LV5/a;

    .line 2
    .line 3
    iget v1, p0, LV5/a$a;->a:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LV5/a;->b(I)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public i(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-object v0, p0, LV5/a$a;->b:LV5/a;

    .line 2
    .line 3
    iget v1, p0, LV5/a$a;->a:I

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, LV5/a;->e(ILandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
