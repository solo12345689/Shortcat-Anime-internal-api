.class public final enum LY/o1$d;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY/o1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation


# static fields
.field public static final enum a:LY/o1$d;

.field public static final enum b:LY/o1$d;

.field public static final enum c:LY/o1$d;

.field public static final enum d:LY/o1$d;

.field public static final enum e:LY/o1$d;

.field public static final enum f:LY/o1$d;

.field private static final synthetic g:[LY/o1$d;

.field private static final synthetic h:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LY/o1$d;

    .line 2
    .line 3
    const-string v1, "ShutDown"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LY/o1$d;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LY/o1$d;->a:LY/o1$d;

    .line 10
    .line 11
    new-instance v0, LY/o1$d;

    .line 12
    .line 13
    const-string v1, "ShuttingDown"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, LY/o1$d;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LY/o1$d;->b:LY/o1$d;

    .line 20
    .line 21
    new-instance v0, LY/o1$d;

    .line 22
    .line 23
    const-string v1, "Inactive"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, LY/o1$d;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, LY/o1$d;->c:LY/o1$d;

    .line 30
    .line 31
    new-instance v0, LY/o1$d;

    .line 32
    .line 33
    const-string v1, "InactivePendingWork"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, LY/o1$d;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, LY/o1$d;->d:LY/o1$d;

    .line 40
    .line 41
    new-instance v0, LY/o1$d;

    .line 42
    .line 43
    const-string v1, "Idle"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, LY/o1$d;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, LY/o1$d;->e:LY/o1$d;

    .line 50
    .line 51
    new-instance v0, LY/o1$d;

    .line 52
    .line 53
    const-string v1, "PendingWork"

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {v0, v1, v2}, LY/o1$d;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v0, LY/o1$d;->f:LY/o1$d;

    .line 60
    .line 61
    invoke-static {}, LY/o1$d;->a()[LY/o1$d;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, LY/o1$d;->g:[LY/o1$d;

    .line 66
    .line 67
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, LY/o1$d;->h:Lkotlin/enums/EnumEntries;

    .line 72
    .line 73
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final synthetic a()[LY/o1$d;
    .locals 6

    .line 1
    sget-object v0, LY/o1$d;->a:LY/o1$d;

    .line 2
    .line 3
    sget-object v1, LY/o1$d;->b:LY/o1$d;

    .line 4
    .line 5
    sget-object v2, LY/o1$d;->c:LY/o1$d;

    .line 6
    .line 7
    sget-object v3, LY/o1$d;->d:LY/o1$d;

    .line 8
    .line 9
    sget-object v4, LY/o1$d;->e:LY/o1$d;

    .line 10
    .line 11
    sget-object v5, LY/o1$d;->f:LY/o1$d;

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [LY/o1$d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LY/o1$d;
    .locals 1

    .line 1
    const-class v0, LY/o1$d;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LY/o1$d;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LY/o1$d;
    .locals 1

    .line 1
    sget-object v0, LY/o1$d;->g:[LY/o1$d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LY/o1$d;

    .line 8
    .line 9
    return-object v0
.end method
