.class public abstract LUb/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LUb/k$a;
    }
.end annotation


# static fields
.field public static final a:LUb/k$a;

.field private static final b:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LUb/k$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LUb/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LUb/k;->a:LUb/k$a;

    .line 8
    .line 9
    new-instance v0, LUb/j;

    .line 10
    .line 11
    invoke-direct {v0}, LUb/j;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, LUb/k;->b:Lkotlin/Lazy;

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic a()LUb/t;
    .locals 1

    .line 1
    invoke-static {}, LUb/k;->c()LUb/t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static final synthetic b()Lkotlin/Lazy;
    .locals 1

    .line 1
    sget-object v0, LUb/k;->b:Lkotlin/Lazy;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final c()LUb/t;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-class v1, Lib/d;

    .line 3
    .line 4
    sget-object v2, Lib/d;->Companion:Lib/d$a;

    .line 5
    .line 6
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "null cannot be cast to non-null type expo.modules.kotlin.ModulesProvider"

    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    check-cast v1, LUb/t;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    return-object v1

    .line 22
    :catch_0
    move-exception v1

    .line 23
    const-string v2, "ExpoModulesHelper"

    .line 24
    .line 25
    const-string v3, "Couldn\'t get expo modules list."

    .line 26
    .line 27
    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 28
    .line 29
    .line 30
    return-object v0
.end method
