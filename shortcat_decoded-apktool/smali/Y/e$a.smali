.class abstract LY/e$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY/e$a$a;
    }
.end annotation


# static fields
.field public static final a:LY/e$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LY/e$a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LY/e$a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LY/e$a;->a:LY/e$a$a;

    .line 8
    .line 9
    return-void
.end method

.method public static final synthetic a(Lg0/a;II)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LY/e$a;->d(Lg0/a;II)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static b()Lg0/a;
    .locals 2

    .line 1
    new-instance v0, Lg0/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lg0/a;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, LY/e$a;->c(Lg0/a;)Lg0/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method private static c(Lg0/a;)Lg0/a;
    .locals 0

    .line 1
    return-object p0
.end method

.method private static final d(Lg0/a;II)I
    .locals 0

    .line 1
    and-int/lit8 p0, p1, 0xf

    .line 2
    .line 3
    shl-int/lit8 p0, p0, 0x1b

    .line 4
    .line 5
    const p1, 0x7ffffff

    .line 6
    .line 7
    .line 8
    and-int/2addr p1, p2

    .line 9
    or-int/2addr p0, p1

    .line 10
    return p0
.end method
