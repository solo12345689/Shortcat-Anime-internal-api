.class public final Lc4/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lc4/l;


# static fields
.field public static final b:Lc4/m;

.field private static final c:Ljava/lang/String;

.field private static final d:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lc4/m;

    .line 2
    .line 3
    invoke-direct {v0}, Lc4/m;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lc4/m;->b:Lc4/m;

    .line 7
    .line 8
    const-class v0, Lc4/m;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "WindowMetricsCalculatorC\u2026at::class.java.simpleName"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lc4/m;->c:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {}, Landroidx/core/view/L0$p;->h()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {}, Landroidx/core/view/L0$p;->g()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {}, Landroidx/core/view/L0$p;->b()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-static {}, Landroidx/core/view/L0$p;->d()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-static {}, Landroidx/core/view/L0$p;->j()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-static {}, Landroidx/core/view/L0$p;->f()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-static {}, Landroidx/core/view/L0$p;->k()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-static {}, Landroidx/core/view/L0$p;->c()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    filled-new-array/range {v1 .. v8}, [Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v0}, LUd/u;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sput-object v0, Lc4/m;->d:Ljava/util/ArrayList;

    .line 94
    .line 95
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final g(Landroid/view/Display;)Landroid/view/DisplayCutout;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "android.view.DisplayInfo"

    .line 3
    .line 4
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const-string v4, "getDisplayInfo"

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 39
    .line 40
    .line 41
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v3, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const-string v3, "displayCutout"

    .line 53
    .line 54
    invoke-virtual {p1, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p1}, Landroidx/compose/ui/platform/b0;->a(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_0

    .line 70
    .line 71
    invoke-static {p1}, Landroidx/compose/ui/platform/c0;->a(Ljava/lang/Object;)Landroid/view/DisplayCutout;

    .line 72
    .line 73
    .line 74
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    return-object p1

    .line 76
    :catch_0
    move-exception p1

    .line 77
    goto :goto_0

    .line 78
    :catch_1
    move-exception p1

    .line 79
    goto :goto_1

    .line 80
    :catch_2
    move-exception p1

    .line 81
    goto :goto_2

    .line 82
    :catch_3
    move-exception p1

    .line 83
    goto :goto_3

    .line 84
    :catch_4
    move-exception p1

    .line 85
    goto :goto_4

    .line 86
    :catch_5
    move-exception p1

    .line 87
    goto :goto_5

    .line 88
    :goto_0
    sget-object v1, Lc4/m;->c:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 91
    .line 92
    .line 93
    goto :goto_6

    .line 94
    :goto_1
    sget-object v1, Lc4/m;->c:Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 97
    .line 98
    .line 99
    goto :goto_6

    .line 100
    :goto_2
    sget-object v1, Lc4/m;->c:Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 103
    .line 104
    .line 105
    goto :goto_6

    .line 106
    :goto_3
    sget-object v1, Lc4/m;->c:Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 109
    .line 110
    .line 111
    goto :goto_6

    .line 112
    :goto_4
    sget-object v1, Lc4/m;->c:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 115
    .line 116
    .line 117
    goto :goto_6

    .line 118
    :goto_5
    sget-object v1, Lc4/m;->c:Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 121
    .line 122
    .line 123
    :cond_0
    :goto_6
    return-object v0
.end method

.method private final h(Landroid/content/Context;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "dimen"

    .line 6
    .line 7
    const-string v1, "android"

    .line 8
    .line 9
    const-string v2, "navigation_bar_height"

    .line 10
    .line 11
    invoke-virtual {p1, v2, v0, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    return p1
.end method

.method private final j(Landroid/app/Activity;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1, p2}, Landroid/view/Display;->getRectSize(Landroid/graphics/Rect;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Lc4/k;
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1e

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    sget-object v0, Lg4/f;->a:Lg4/f;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lg4/f;->c(Landroid/content/Context;)Lc4/k;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    sget-object v0, Lg4/b;->a:Lg4/b;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lg4/b;->a(Landroid/content/Context;)Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    instance-of v1, v0, Landroid/app/Activity;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    check-cast v0, Landroid/app/Activity;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lc4/m;->b(Landroid/app/Activity;)Lc4/k;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_1
    instance-of v0, v0, Landroid/inputmethodservice/InputMethodService;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    const-string v0, "window"

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string v0, "null cannot be cast to non-null type android.view.WindowManager"

    .line 47
    .line 48
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    check-cast p1, Landroid/view/WindowManager;

    .line 52
    .line 53
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const-string v0, "wm.defaultDisplay"

    .line 58
    .line 59
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1}, Lc4/m;->i(Landroid/view/Display;)Landroid/graphics/Point;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance v0, Landroid/graphics/Rect;

    .line 67
    .line 68
    iget v1, p1, Landroid/graphics/Point;->x:I

    .line 69
    .line 70
    iget p1, p1, Landroid/graphics/Point;->y:I

    .line 71
    .line 72
    const/4 v2, 0x0

    .line 73
    invoke-direct {v0, v2, v2, v1, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 74
    .line 75
    .line 76
    new-instance p1, Lc4/k;

    .line 77
    .line 78
    const/4 v1, 0x2

    .line 79
    const/4 v2, 0x0

    .line 80
    invoke-direct {p1, v0, v2, v1, v2}, Lc4/k;-><init>(Landroid/graphics/Rect;Landroidx/core/view/L0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 85
    .line 86
    new-instance v1, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string p1, " is not a UiContext"

    .line 95
    .line 96
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v0
.end method

.method public b(Landroid/app/Activity;)Lc4/k;
    .locals 3

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1e

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    sget-object v2, Lg4/f;->a:Lg4/f;

    .line 13
    .line 14
    invoke-virtual {v2, p1}, Lg4/f;->a(Landroid/content/Context;)Landroid/graphics/Rect;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/16 v2, 0x1d

    .line 20
    .line 21
    if-lt v0, v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lc4/m;->e(Landroid/app/Activity;)Landroid/graphics/Rect;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/16 v2, 0x1c

    .line 29
    .line 30
    if-lt v0, v2, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lc4/m;->d(Landroid/app/Activity;)Landroid/graphics/Rect;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-virtual {p0, p1}, Lc4/m;->c(Landroid/app/Activity;)Landroid/graphics/Rect;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    :goto_0
    if-lt v0, v1, :cond_3

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lc4/m;->f(Landroid/content/Context;)Landroidx/core/view/L0;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    new-instance p1, Landroidx/core/view/L0$a;

    .line 49
    .line 50
    invoke-direct {p1}, Landroidx/core/view/L0$a;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Landroidx/core/view/L0$a;->a()Landroidx/core/view/L0;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const-string v0, "{\n            WindowInse\u2026ilder().build()\n        }"

    .line 58
    .line 59
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :goto_1
    new-instance v0, Lc4/k;

    .line 63
    .line 64
    new-instance v1, La4/b;

    .line 65
    .line 66
    invoke-direct {v1, v2}, La4/b;-><init>(Landroid/graphics/Rect;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {v0, v1, p1}, Lc4/k;-><init>(La4/b;Landroidx/core/view/L0;)V

    .line 70
    .line 71
    .line 72
    return-object v0
.end method

.method public final c(Landroid/app/Activity;)Landroid/graphics/Rect;
    .locals 5

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Rect;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1, v0}, Landroid/view/Display;->getRectSize(Landroid/graphics/Rect;)V

    .line 20
    .line 21
    .line 22
    sget-object v2, Lg4/a;->a:Lg4/a;

    .line 23
    .line 24
    invoke-virtual {v2, p1}, Lg4/a;->a(Landroid/app/Activity;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    const-string v2, "defaultDisplay"

    .line 31
    .line 32
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v1}, Lc4/m;->i(Landroid/view/Display;)Landroid/graphics/Point;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-direct {p0, p1}, Lc4/m;->h(Landroid/content/Context;)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    iget v2, v0, Landroid/graphics/Rect;->bottom:I

    .line 44
    .line 45
    add-int v3, v2, p1

    .line 46
    .line 47
    iget v4, v1, Landroid/graphics/Point;->y:I

    .line 48
    .line 49
    if-ne v3, v4, :cond_0

    .line 50
    .line 51
    add-int/2addr v2, p1

    .line 52
    iput v2, v0, Landroid/graphics/Rect;->bottom:I

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_0
    iget v2, v0, Landroid/graphics/Rect;->right:I

    .line 56
    .line 57
    add-int v3, v2, p1

    .line 58
    .line 59
    iget v1, v1, Landroid/graphics/Point;->x:I

    .line 60
    .line 61
    if-ne v3, v1, :cond_1

    .line 62
    .line 63
    add-int/2addr v2, p1

    .line 64
    iput v2, v0, Landroid/graphics/Rect;->right:I

    .line 65
    .line 66
    :cond_1
    return-object v0
.end method

.method public final d(Landroid/app/Activity;)Landroid/graphics/Rect;
    .locals 9

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Rect;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :try_start_0
    const-class v2, Landroid/content/res/Configuration;

    .line 20
    .line 21
    const-string v3, "windowConfiguration"

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    sget-object v2, Lg4/a;->a:Lg4/a;

    .line 36
    .line 37
    invoke-virtual {v2, p1}, Lg4/a;->a(Landroid/app/Activity;)Z

    .line 38
    .line 39
    .line 40
    move-result v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    const-string v3, "null cannot be cast to non-null type android.graphics.Rect"

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const-string v5, "getBounds"

    .line 51
    .line 52
    invoke-virtual {v2, v5, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    check-cast v1, Landroid/graphics/Rect;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 66
    .line 67
    .line 68
    goto :goto_4

    .line 69
    :catch_0
    move-exception v1

    .line 70
    goto :goto_0

    .line 71
    :catch_1
    move-exception v1

    .line 72
    goto :goto_1

    .line 73
    :catch_2
    move-exception v1

    .line 74
    goto :goto_2

    .line 75
    :catch_3
    move-exception v1

    .line 76
    goto :goto_3

    .line 77
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    const-string v5, "getAppBounds"

    .line 82
    .line 83
    invoke-virtual {v2, v5, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v2, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    check-cast v1, Landroid/graphics/Rect;

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0

    .line 97
    .line 98
    .line 99
    goto :goto_4

    .line 100
    :goto_0
    sget-object v2, Lc4/m;->c:Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 103
    .line 104
    .line 105
    invoke-direct {p0, p1, v0}, Lc4/m;->j(Landroid/app/Activity;Landroid/graphics/Rect;)V

    .line 106
    .line 107
    .line 108
    goto :goto_4

    .line 109
    :goto_1
    sget-object v2, Lc4/m;->c:Ljava/lang/String;

    .line 110
    .line 111
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 112
    .line 113
    .line 114
    invoke-direct {p0, p1, v0}, Lc4/m;->j(Landroid/app/Activity;Landroid/graphics/Rect;)V

    .line 115
    .line 116
    .line 117
    goto :goto_4

    .line 118
    :goto_2
    sget-object v2, Lc4/m;->c:Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 121
    .line 122
    .line 123
    invoke-direct {p0, p1, v0}, Lc4/m;->j(Landroid/app/Activity;Landroid/graphics/Rect;)V

    .line 124
    .line 125
    .line 126
    goto :goto_4

    .line 127
    :goto_3
    sget-object v2, Lc4/m;->c:Ljava/lang/String;

    .line 128
    .line 129
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 130
    .line 131
    .line 132
    invoke-direct {p0, p1, v0}, Lc4/m;->j(Landroid/app/Activity;Landroid/graphics/Rect;)V

    .line 133
    .line 134
    .line 135
    :goto_4
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    new-instance v2, Landroid/graphics/Point;

    .line 144
    .line 145
    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v2}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 149
    .line 150
    .line 151
    sget-object v3, Lg4/a;->a:Lg4/a;

    .line 152
    .line 153
    invoke-virtual {v3, p1}, Lg4/a;->a(Landroid/app/Activity;)Z

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    const/4 v5, 0x0

    .line 158
    if-nez v4, :cond_3

    .line 159
    .line 160
    invoke-direct {p0, p1}, Lc4/m;->h(Landroid/content/Context;)I

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    iget v6, v0, Landroid/graphics/Rect;->bottom:I

    .line 165
    .line 166
    add-int v7, v6, v4

    .line 167
    .line 168
    iget v8, v2, Landroid/graphics/Point;->y:I

    .line 169
    .line 170
    if-ne v7, v8, :cond_1

    .line 171
    .line 172
    add-int/2addr v6, v4

    .line 173
    iput v6, v0, Landroid/graphics/Rect;->bottom:I

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_1
    iget v6, v0, Landroid/graphics/Rect;->right:I

    .line 177
    .line 178
    add-int v7, v6, v4

    .line 179
    .line 180
    iget v8, v2, Landroid/graphics/Point;->x:I

    .line 181
    .line 182
    if-ne v7, v8, :cond_2

    .line 183
    .line 184
    add-int/2addr v6, v4

    .line 185
    iput v6, v0, Landroid/graphics/Rect;->right:I

    .line 186
    .line 187
    goto :goto_5

    .line 188
    :cond_2
    iget v6, v0, Landroid/graphics/Rect;->left:I

    .line 189
    .line 190
    if-ne v6, v4, :cond_3

    .line 191
    .line 192
    iput v5, v0, Landroid/graphics/Rect;->left:I

    .line 193
    .line 194
    :cond_3
    :goto_5
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    iget v6, v2, Landroid/graphics/Point;->x:I

    .line 199
    .line 200
    if-lt v4, v6, :cond_4

    .line 201
    .line 202
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    iget v6, v2, Landroid/graphics/Point;->y:I

    .line 207
    .line 208
    if-ge v4, v6, :cond_8

    .line 209
    .line 210
    :cond_4
    invoke-virtual {v3, p1}, Lg4/a;->a(Landroid/app/Activity;)Z

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    if-nez p1, :cond_8

    .line 215
    .line 216
    const-string p1, "currentDisplay"

    .line 217
    .line 218
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-direct {p0, v1}, Lc4/m;->g(Landroid/view/Display;)Landroid/view/DisplayCutout;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    if-eqz p1, :cond_8

    .line 226
    .line 227
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 228
    .line 229
    sget-object v3, Lg4/k;->a:Lg4/k;

    .line 230
    .line 231
    invoke-virtual {v3, p1}, Lg4/k;->b(Landroid/view/DisplayCutout;)I

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    if-ne v1, v4, :cond_5

    .line 236
    .line 237
    iput v5, v0, Landroid/graphics/Rect;->left:I

    .line 238
    .line 239
    :cond_5
    iget v1, v2, Landroid/graphics/Point;->x:I

    .line 240
    .line 241
    iget v4, v0, Landroid/graphics/Rect;->right:I

    .line 242
    .line 243
    sub-int/2addr v1, v4

    .line 244
    invoke-virtual {v3, p1}, Lg4/k;->c(Landroid/view/DisplayCutout;)I

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    if-ne v1, v4, :cond_6

    .line 249
    .line 250
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 251
    .line 252
    invoke-virtual {v3, p1}, Lg4/k;->c(Landroid/view/DisplayCutout;)I

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    add-int/2addr v1, v4

    .line 257
    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 258
    .line 259
    :cond_6
    iget v1, v0, Landroid/graphics/Rect;->top:I

    .line 260
    .line 261
    invoke-virtual {v3, p1}, Lg4/k;->d(Landroid/view/DisplayCutout;)I

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    if-ne v1, v4, :cond_7

    .line 266
    .line 267
    iput v5, v0, Landroid/graphics/Rect;->top:I

    .line 268
    .line 269
    :cond_7
    iget v1, v2, Landroid/graphics/Point;->y:I

    .line 270
    .line 271
    iget v2, v0, Landroid/graphics/Rect;->bottom:I

    .line 272
    .line 273
    sub-int/2addr v1, v2

    .line 274
    invoke-virtual {v3, p1}, Lg4/k;->a(Landroid/view/DisplayCutout;)I

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    if-ne v1, v2, :cond_8

    .line 279
    .line 280
    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 281
    .line 282
    invoke-virtual {v3, p1}, Lg4/k;->a(Landroid/view/DisplayCutout;)I

    .line 283
    .line 284
    .line 285
    move-result p1

    .line 286
    add-int/2addr v1, p1

    .line 287
    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 288
    .line 289
    :cond_8
    return-object v0
.end method

.method public final e(Landroid/app/Activity;)Landroid/graphics/Rect;
    .locals 4

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :try_start_0
    const-class v1, Landroid/content/res/Configuration;

    .line 15
    .line 16
    const-string v2, "windowConfiguration"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "getBounds"

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v2, Landroid/graphics/Rect;

    .line 42
    .line 43
    invoke-virtual {v1, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "null cannot be cast to non-null type android.graphics.Rect"

    .line 48
    .line 49
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    check-cast v0, Landroid/graphics/Rect;

    .line 53
    .line 54
    invoke-direct {v2, v0}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    return-object v2

    .line 58
    :catch_0
    move-exception v0

    .line 59
    goto :goto_0

    .line 60
    :catch_1
    move-exception v0

    .line 61
    goto :goto_1

    .line 62
    :catch_2
    move-exception v0

    .line 63
    goto :goto_2

    .line 64
    :catch_3
    move-exception v0

    .line 65
    goto :goto_3

    .line 66
    :goto_0
    sget-object v1, Lc4/m;->c:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, p1}, Lc4/m;->d(Landroid/app/Activity;)Landroid/graphics/Rect;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    goto :goto_4

    .line 76
    :goto_1
    sget-object v1, Lc4/m;->c:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, p1}, Lc4/m;->d(Landroid/app/Activity;)Landroid/graphics/Rect;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    goto :goto_4

    .line 86
    :goto_2
    sget-object v1, Lc4/m;->c:Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, p1}, Lc4/m;->d(Landroid/app/Activity;)Landroid/graphics/Rect;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    goto :goto_4

    .line 96
    :goto_3
    sget-object v1, Lc4/m;->c:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, p1}, Lc4/m;->d(Landroid/app/Activity;)Landroid/graphics/Rect;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    :goto_4
    return-object p1
.end method

.method public final f(Landroid/content/Context;)Landroidx/core/view/L0;
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1e

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    sget-object v0, Lg4/f;->a:Lg4/f;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lg4/f;->b(Landroid/content/Context;)Landroidx/core/view/L0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/Exception;

    .line 20
    .line 21
    const-string v0, "Incompatible SDK version"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1
.end method

.method public final i(Landroid/view/Display;)Landroid/graphics/Point;
    .locals 1

    .line 1
    const-string v0, "display"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Point;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
