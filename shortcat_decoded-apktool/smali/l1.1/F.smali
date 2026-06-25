.class public final Ll1/F;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll1/F$a;
    }
.end annotation


# static fields
.field public static final b:Ll1/F$a;

.field private static final c:Ll1/F;

.field private static final d:Ll1/F;

.field private static final e:Ll1/F;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ll1/F$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ll1/F$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ll1/F;->b:Ll1/F$a;

    .line 8
    .line 9
    new-instance v0, Ll1/F;

    .line 10
    .line 11
    const-string v1, "visible"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ll1/F;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Ll1/F;->c:Ll1/F;

    .line 17
    .line 18
    new-instance v0, Ll1/F;

    .line 19
    .line 20
    const-string v1, "invisible"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ll1/F;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Ll1/F;->d:Ll1/F;

    .line 26
    .line 27
    new-instance v0, Ll1/F;

    .line 28
    .line 29
    const-string v1, "gone"

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ll1/F;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Ll1/F;->e:Ll1/F;

    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll1/F;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic a()Ll1/F;
    .locals 1

    .line 1
    sget-object v0, Ll1/F;->c:Ll1/F;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ll1/F;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
