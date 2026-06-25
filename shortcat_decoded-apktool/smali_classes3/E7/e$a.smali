.class public final LE7/e$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LE7/e$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LE7/e$a;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/a;LE7/b;LE7/c;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/h;)[Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, LE7/e$a;->b(Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/a;LE7/b;LE7/c;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/h;)[Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final b(Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/a;LE7/b;LE7/c;Landroid/graphics/drawable/Drawable;Ljava/util/List;LE7/h;)[Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-static {p2}, LUd/u;->U(Ljava/util/List;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 16
    .line 17
    .line 18
    if-eqz p3, :cond_1

    .line 19
    .line 20
    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    :cond_1
    if-eqz p4, :cond_2

    .line 24
    .line 25
    invoke-interface {v0, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    :cond_2
    if-eqz p5, :cond_3

    .line 29
    .line 30
    invoke-interface {v0, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    :cond_3
    if-eqz p6, :cond_4

    .line 34
    .line 35
    invoke-interface {v0, p6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    :cond_4
    invoke-static {p7}, LUd/u;->U(Ljava/util/List;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 43
    .line 44
    .line 45
    if-eqz p8, :cond_5

    .line 46
    .line 47
    invoke-interface {v0, p8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :cond_5
    const/4 p1, 0x0

    .line 51
    new-array p1, p1, [Landroid/graphics/drawable/Drawable;

    .line 52
    .line 53
    invoke-interface {v0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, [Landroid/graphics/drawable/Drawable;

    .line 58
    .line 59
    return-object p1
.end method
