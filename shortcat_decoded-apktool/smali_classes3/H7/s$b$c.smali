.class public final enum LH7/s$b$c;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH7/s$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH7/s$b$c$a;
    }
.end annotation


# static fields
.field public static final b:LH7/s$b$c$a;

.field public static final enum c:LH7/s$b$c;

.field public static final enum d:LH7/s$b$c;

.field public static final enum e:LH7/s$b$c;

.field public static final enum f:LH7/s$b$c;

.field private static final synthetic g:[LH7/s$b$c;

.field private static final synthetic h:Lkotlin/enums/EnumEntries;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LH7/s$b$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "to top right"

    .line 5
    .line 6
    const-string v3, "TO_TOP_RIGHT"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, LH7/s$b$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, LH7/s$b$c;->c:LH7/s$b$c;

    .line 12
    .line 13
    new-instance v0, LH7/s$b$c;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "to bottom right"

    .line 17
    .line 18
    const-string v3, "TO_BOTTOM_RIGHT"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, LH7/s$b$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, LH7/s$b$c;->d:LH7/s$b$c;

    .line 24
    .line 25
    new-instance v0, LH7/s$b$c;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "to top left"

    .line 29
    .line 30
    const-string v3, "TO_TOP_LEFT"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, LH7/s$b$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, LH7/s$b$c;->e:LH7/s$b$c;

    .line 36
    .line 37
    new-instance v0, LH7/s$b$c;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "to bottom left"

    .line 41
    .line 42
    const-string v3, "TO_BOTTOM_LEFT"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, LH7/s$b$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, LH7/s$b$c;->f:LH7/s$b$c;

    .line 48
    .line 49
    invoke-static {}, LH7/s$b$c;->a()[LH7/s$b$c;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, LH7/s$b$c;->g:[LH7/s$b$c;

    .line 54
    .line 55
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, LH7/s$b$c;->h:Lkotlin/enums/EnumEntries;

    .line 60
    .line 61
    new-instance v0, LH7/s$b$c$a;

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    invoke-direct {v0, v1}, LH7/s$b$c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 65
    .line 66
    .line 67
    sput-object v0, LH7/s$b$c;->b:LH7/s$b$c$a;

    .line 68
    .line 69
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, LH7/s$b$c;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private static final synthetic a()[LH7/s$b$c;
    .locals 4

    .line 1
    sget-object v0, LH7/s$b$c;->c:LH7/s$b$c;

    .line 2
    .line 3
    sget-object v1, LH7/s$b$c;->d:LH7/s$b$c;

    .line 4
    .line 5
    sget-object v2, LH7/s$b$c;->e:LH7/s$b$c;

    .line 6
    .line 7
    sget-object v3, LH7/s$b$c;->f:LH7/s$b$c;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [LH7/s$b$c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LH7/s$b$c;
    .locals 1

    .line 1
    const-class v0, LH7/s$b$c;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LH7/s$b$c;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LH7/s$b$c;
    .locals 1

    .line 1
    sget-object v0, LH7/s$b$c;->g:[LH7/s$b$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LH7/s$b$c;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LH7/s$b$c;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
