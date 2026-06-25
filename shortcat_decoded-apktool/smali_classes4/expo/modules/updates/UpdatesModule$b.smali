.class final Lexpo/modules/updates/UpdatesModule$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/updates/UpdatesModule;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lexpo/modules/updates/UpdatesModule$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/updates/UpdatesModule$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/updates/UpdatesModule$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/updates/UpdatesModule$b;->a:Lexpo/modules/updates/UpdatesModule$b;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lexpo/modules/kotlin/exception/CodedException;

    .line 5
    .line 6
    const-string v1, "ERR_UPDATES_READ_LOGS"

    .line 7
    .line 8
    const-string v2, "There was an error when clearing the expo-updates log file"

    .line 9
    .line 10
    invoke-direct {v0, v1, v2, p1}, Lexpo/modules/kotlin/exception/CodedException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Exception;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lexpo/modules/updates/UpdatesModule$b;->a(Ljava/lang/Exception;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
