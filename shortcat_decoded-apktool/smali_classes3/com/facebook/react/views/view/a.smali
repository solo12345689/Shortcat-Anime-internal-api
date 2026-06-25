.class public final Lcom/facebook/react/views/view/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Lcom/facebook/react/views/view/a;

.field private static b:Ljava/lang/reflect/Method;

.field private static c:Ljava/lang/reflect/Method;

.field private static d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/view/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/view/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/facebook/react/views/view/a;->a:Lcom/facebook/react/views/view/a;

    .line 7
    .line 8
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

.method public static final a(Landroid/graphics/Canvas;Z)V
    .locals 3

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1d

    .line 9
    .line 10
    if-lt v0, v1, :cond_1

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-static {p0}, Ls0/n0;->a(Landroid/graphics/Canvas;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-static {p0}, Ls0/o0;->a(Landroid/graphics/Canvas;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    sget-object v0, Lcom/facebook/react/views/view/a;->a:Lcom/facebook/react/views/view/a;

    .line 23
    .line 24
    invoke-direct {v0}, Lcom/facebook/react/views/view/a;->b()V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    const-string v1, "Required value was null."

    .line 29
    .line 30
    if-eqz p1, :cond_3

    .line 31
    .line 32
    :try_start_0
    sget-object v2, Lcom/facebook/react/views/view/a;->b:Ljava/lang/reflect/Method;

    .line 33
    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    invoke-virtual {v2, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p0

    .line 48
    :cond_3
    :goto_0
    if-nez p1, :cond_5

    .line 49
    .line 50
    sget-object p1, Lcom/facebook/react/views/view/a;->c:Ljava/lang/reflect/Method;

    .line 51
    .line 52
    if-eqz p1, :cond_5

    .line 53
    .line 54
    if-eqz p1, :cond_4

    .line 55
    .line 56
    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    :catch_0
    :cond_5
    return-void
.end method

.method private final b()V
    .locals 9

    .line 1
    const-string v0, "null cannot be cast to non-null type java.lang.reflect.Method"

    .line 2
    .line 3
    sget-boolean v1, Lcom/facebook/react/views/view/a;->d:Z

    .line 4
    .line 5
    if-nez v1, :cond_4

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    :try_start_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    const/16 v3, 0x1c

    .line 11
    .line 12
    const-string v4, "insertInorderBarrier"

    .line 13
    .line 14
    const-string v5, "insertReorderBarrier"

    .line 15
    .line 16
    const-class v6, Landroid/graphics/Canvas;

    .line 17
    .line 18
    if-ne v2, v3, :cond_0

    .line 19
    .line 20
    :try_start_1
    const-class v2, Ljava/lang/Class;

    .line 21
    .line 22
    const-string v3, "getDeclaredMethod"

    .line 23
    .line 24
    const-class v7, Ljava/lang/String;

    .line 25
    .line 26
    const-class v8, [Ljava/lang/Object;

    .line 27
    .line 28
    filled-new-array {v7, v8}, [Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    invoke-virtual {v2, v3, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/4 v3, 0x0

    .line 37
    new-array v7, v3, [Ljava/lang/Class;

    .line 38
    .line 39
    filled-new-array {v5, v7}, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v2, v6, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    check-cast v5, Ljava/lang/reflect/Method;

    .line 51
    .line 52
    sput-object v5, Lcom/facebook/react/views/view/a;->b:Ljava/lang/reflect/Method;

    .line 53
    .line 54
    new-array v3, v3, [Ljava/lang/Class;

    .line 55
    .line 56
    filled-new-array {v4, v3}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v2, v6, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    check-cast v2, Ljava/lang/reflect/Method;

    .line 68
    .line 69
    sput-object v2, Lcom/facebook/react/views/view/a;->c:Ljava/lang/reflect/Method;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    const/4 v0, 0x0

    .line 73
    invoke-virtual {v6, v5, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    sput-object v2, Lcom/facebook/react/views/view/a;->b:Ljava/lang/reflect/Method;

    .line 78
    .line 79
    invoke-virtual {v6, v4, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sput-object v0, Lcom/facebook/react/views/view/a;->c:Ljava/lang/reflect/Method;

    .line 84
    .line 85
    :goto_0
    sget-object v0, Lcom/facebook/react/views/view/a;->b:Ljava/lang/reflect/Method;

    .line 86
    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    sget-object v2, Lcom/facebook/react/views/view/a;->c:Ljava/lang/reflect/Method;

    .line 90
    .line 91
    if-nez v2, :cond_1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    if-eqz v0, :cond_2

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 97
    .line 98
    .line 99
    :cond_2
    sget-object v0, Lcom/facebook/react/views/view/a;->c:Ljava/lang/reflect/Method;

    .line 100
    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0

    .line 104
    .line 105
    .line 106
    :catch_0
    :cond_3
    sput-boolean v1, Lcom/facebook/react/views/view/a;->d:Z

    .line 107
    .line 108
    :cond_4
    :goto_1
    return-void
.end method
