.class public final enum LMb/a;
.super Ljava/lang/Enum;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LMb/a$a;
    }
.end annotation


# static fields
.field public static final b:LMb/a$a;

.field public static final enum c:LMb/a;

.field public static final enum d:LMb/a;

.field public static final enum e:LMb/a;

.field private static final synthetic f:[LMb/a;

.field private static final synthetic g:Lkotlin/enums/EnumEntries;


# instance fields
.field private final a:[LS4/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LMb/a;

    .line 2
    .line 3
    sget-object v1, LS4/a;->a:LS4/a;

    .line 4
    .line 5
    sget-object v2, LS4/a;->b:LS4/a;

    .line 6
    .line 7
    filled-new-array {v1, v2}, [LS4/a;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "NONE"

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v0, v2, v3, v1}, LMb/a;-><init>(Ljava/lang/String;I[LS4/a;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, LMb/a;->c:LMb/a;

    .line 18
    .line 19
    new-instance v0, LMb/a;

    .line 20
    .line 21
    sget-object v1, LS4/a;->c:LS4/a;

    .line 22
    .line 23
    sget-object v2, LS4/a;->d:LS4/a;

    .line 24
    .line 25
    filled-new-array {v1, v2}, [LS4/a;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v2, "DISK"

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-direct {v0, v2, v3, v1}, LMb/a;-><init>(Ljava/lang/String;I[LS4/a;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, LMb/a;->d:LMb/a;

    .line 36
    .line 37
    new-instance v0, LMb/a;

    .line 38
    .line 39
    sget-object v1, LS4/a;->e:LS4/a;

    .line 40
    .line 41
    filled-new-array {v1}, [LS4/a;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v2, "MEMORY"

    .line 46
    .line 47
    const/4 v3, 0x2

    .line 48
    invoke-direct {v0, v2, v3, v1}, LMb/a;-><init>(Ljava/lang/String;I[LS4/a;)V

    .line 49
    .line 50
    .line 51
    sput-object v0, LMb/a;->e:LMb/a;

    .line 52
    .line 53
    invoke-static {}, LMb/a;->a()[LMb/a;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, LMb/a;->f:[LMb/a;

    .line 58
    .line 59
    invoke-static {v0}, Lbe/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, LMb/a;->g:Lkotlin/enums/EnumEntries;

    .line 64
    .line 65
    new-instance v0, LMb/a$a;

    .line 66
    .line 67
    const/4 v1, 0x0

    .line 68
    invoke-direct {v0, v1}, LMb/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, LMb/a;->b:LMb/a$a;

    .line 72
    .line 73
    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/String;I[LS4/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, LMb/a;->a:[LS4/a;

    .line 5
    .line 6
    return-void
.end method

.method private static final synthetic a()[LMb/a;
    .locals 3

    .line 1
    sget-object v0, LMb/a;->c:LMb/a;

    .line 2
    .line 3
    sget-object v1, LMb/a;->d:LMb/a;

    .line 4
    .line 5
    sget-object v2, LMb/a;->e:LMb/a;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [LMb/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public static final synthetic b(LMb/a;)[LS4/a;
    .locals 0

    .line 1
    iget-object p0, p0, LMb/a;->a:[LS4/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static c()Lkotlin/enums/EnumEntries;
    .locals 1

    .line 1
    sget-object v0, LMb/a;->g:Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LMb/a;
    .locals 1

    .line 1
    const-class v0, LMb/a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LMb/a;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LMb/a;
    .locals 1

    .line 1
    sget-object v0, LMb/a;->f:[LMb/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LMb/a;

    .line 8
    .line 9
    return-object v0
.end method
