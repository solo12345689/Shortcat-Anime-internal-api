.class public final Lf5/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LS4/j;


# instance fields
.field private final a:LV4/d;


# direct methods
.method public constructor <init>(LV4/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf5/h;->a:LV4/d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;IILS4/h;)LU4/v;
    .locals 0

    .line 1
    check-cast p1, LP4/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lf5/h;->c(LP4/a;IILS4/h;)LU4/v;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;LS4/h;)Z
    .locals 0

    .line 1
    check-cast p1, LP4/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lf5/h;->d(LP4/a;LS4/h;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c(LP4/a;IILS4/h;)LU4/v;
    .locals 0

    .line 1
    invoke-interface {p1}, LP4/a;->f()Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Lf5/h;->a:LV4/d;

    .line 6
    .line 7
    invoke-static {p1, p2}, Lb5/g;->c(Landroid/graphics/Bitmap;LV4/d;)Lb5/g;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public d(LP4/a;LS4/h;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method
