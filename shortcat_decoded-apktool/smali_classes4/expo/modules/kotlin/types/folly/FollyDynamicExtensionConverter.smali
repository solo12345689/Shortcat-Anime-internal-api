.class public final Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter;",
        "",
        "<init>",
        "()V",
        "a",
        "expo-modules-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter$a;

.field private static final b:Landroid/util/ArrayMap;

.field private static c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter;->a:Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter$a;

    .line 8
    .line 9
    new-instance v0, Landroid/util/ArrayMap;

    .line 10
    .line 11
    invoke-direct {v0}, Landroid/util/ArrayMap;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter;->b:Landroid/util/ArrayMap;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic a()Landroid/util/ArrayMap;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter;->b:Landroid/util/ArrayMap;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic b()I
    .locals 1

    .line 1
    sget v0, Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic c(I)V
    .locals 0

    .line 1
    sput p0, Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter;->c:I

    .line 2
    .line 3
    return-void
.end method

.method public static final declared-synchronized get(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-class v0, Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter;->a:Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter$a;

    .line 5
    .line 6
    invoke-virtual {v1, p0}, Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter$a;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    monitor-exit v0

    .line 11
    return-object p0

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw p0
.end method

.method public static final declared-synchronized put(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1
    const-class v0, Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter;->a:Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter$a;

    .line 5
    .line 6
    invoke-virtual {v1, p0}, Lexpo/modules/kotlin/types/folly/FollyDynamicExtensionConverter$a;->put(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    monitor-exit v0

    .line 11
    return-object p0

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw p0
.end method
