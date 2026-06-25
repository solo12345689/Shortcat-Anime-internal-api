.class public final Lexpo/modules/updates/UpdatesPackage;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lsb/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/updates/UpdatesPackage$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\r\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u000cJ\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "Lexpo/modules/updates/UpdatesPackage;",
        "Lsb/g;",
        "<init>",
        "()V",
        "",
        "j",
        "()Z",
        "Landroid/content/Context;",
        "context",
        "",
        "Lsb/j;",
        "a",
        "(Landroid/content/Context;)Ljava/util/List;",
        "activityContext",
        "Lsb/h;",
        "d",
        "Lsb/b;",
        "e",
        "expo-updates_release"
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
.field public static final a:Lexpo/modules/updates/UpdatesPackage$a;

.field private static final b:Ljava/lang/String;

.field private static final c:Z

.field private static final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/updates/UpdatesPackage$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/updates/UpdatesPackage$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/updates/UpdatesPackage;->a:Lexpo/modules/updates/UpdatesPackage$a;

    .line 8
    .line 9
    const-class v0, Lexpo/modules/updates/UpdatesPackage;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lexpo/modules/updates/UpdatesPackage;->b:Ljava/lang/String;

    .line 16
    .line 17
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

.method public static final synthetic g(Lexpo/modules/updates/UpdatesPackage;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/updates/UpdatesPackage;->j()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic h()Z
    .locals 1

    .line 1
    sget-boolean v0, Lexpo/modules/updates/UpdatesPackage;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic i()Z
    .locals 1

    .line 1
    sget-boolean v0, Lexpo/modules/updates/UpdatesPackage;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method private final j()Z
    .locals 1

    .line 1
    :try_start_0
    const-string v0, "androidx.test.espresso.Espresso"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0

    .line 8
    :catch_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method


# virtual methods
.method public a(Landroid/content/Context;)Ljava/util/List;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/updates/UpdatesPackage$d;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lexpo/modules/updates/UpdatesPackage$d;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public d(Landroid/content/Context;)Ljava/util/List;
    .locals 1

    .line 1
    const-string v0, "activityContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lexpo/modules/updates/UpdatesPackage$c;

    .line 7
    .line 8
    invoke-direct {p1}, Lexpo/modules/updates/UpdatesPackage$c;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public e(Landroid/content/Context;)Ljava/util/List;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/updates/UpdatesPackage$b;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lexpo/modules/updates/UpdatesPackage$b;-><init>(Lexpo/modules/updates/UpdatesPackage;Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
