.class abstract enum Lrf/z$a;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrf/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrf/z$a$a;,
        Lrf/z$a$b;,
        Lrf/z$a$c;,
        Lrf/z$a$d;
    }
.end annotation


# static fields
.field public static final enum a:Lrf/z$a;

.field public static final enum b:Lrf/z$a;

.field public static final enum c:Lrf/z$a;

.field public static final enum d:Lrf/z$a;

.field private static final synthetic e:[Lrf/z$a;

.field private static final synthetic f:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lrf/z$a$c;

    .line 2
    .line 3
    const-string v1, "START"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lrf/z$a$c;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lrf/z$a;->a:Lrf/z$a;

    .line 10
    .line 11
    new-instance v0, Lrf/z$a$a;

    .line 12
    .line 13
    const-string v1, "ACCEPT_NULL"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lrf/z$a$a;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lrf/z$a;->b:Lrf/z$a;

    .line 20
    .line 21
    new-instance v0, Lrf/z$a$d;

    .line 22
    .line 23
    const-string v1, "UNKNOWN"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lrf/z$a$d;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lrf/z$a;->c:Lrf/z$a;

    .line 30
    .line 31
    new-instance v0, Lrf/z$a$b;

    .line 32
    .line 33
    const-string v1, "NOT_NULL"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lrf/z$a$b;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lrf/z$a;->d:Lrf/z$a;

    .line 40
    .line 41
    invoke-static {}, Lrf/z$a;->a()[Lrf/z$a;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lrf/z$a;->e:[Lrf/z$a;

    .line 46
    .line 47
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lrf/z$a;->f:Lkotlin/enums/EnumEntries;

    .line 52
    .line 53
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lrf/z$a;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic a()[Lrf/z$a;
    .locals 4

    .line 1
    sget-object v0, Lrf/z$a;->a:Lrf/z$a;

    .line 2
    .line 3
    sget-object v1, Lrf/z$a;->b:Lrf/z$a;

    .line 4
    .line 5
    sget-object v2, Lrf/z$a;->c:Lrf/z$a;

    .line 6
    .line 7
    sget-object v3, Lrf/z$a;->d:Lrf/z$a;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Lrf/z$a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lrf/z$a;
    .locals 1

    .line 1
    const-class v0, Lrf/z$a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lrf/z$a;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lrf/z$a;
    .locals 1

    .line 1
    sget-object v0, Lrf/z$a;->e:[Lrf/z$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lrf/z$a;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public abstract b(Lqf/M0;)Lrf/z$a;
.end method

.method protected final c(Lqf/M0;)Lrf/z$a;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lqf/S;->O0()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object p1, Lrf/z$a;->b:Lrf/z$a;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    instance-of v0, p1, Lqf/y;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    move-object v0, p1

    .line 20
    check-cast v0, Lqf/y;

    .line 21
    .line 22
    invoke-virtual {v0}, Lqf/y;->Z0()Lqf/d0;

    .line 23
    .line 24
    .line 25
    :cond_1
    sget-object v0, Lrf/r;->a:Lrf/r;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lrf/r;->a(Lqf/M0;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    sget-object p1, Lrf/z$a;->d:Lrf/z$a;

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_2
    sget-object p1, Lrf/z$a;->c:Lrf/z$a;

    .line 37
    .line 38
    return-object p1
.end method
